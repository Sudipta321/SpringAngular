<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html ng-app="">
<head>
<script
       src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.13/angular.js"></script>
<script type='text/javascript'>
       function MyCtrl($scope, $http) {
              $scope.height = 20;

              $http.get('http://localhost:8082/SpringAngular/getClientList').success(
                           function(data, status, headers, config) {
                                  $scope.clientList = data;
                           }).error(function(data, status, headers, config) {
              });


               $scope.changeClient = function(event) {

                    $http.get('http://localhost:8082/SpringAngular/getFileList?clientId='+$scope.selectedClientId).success(
                           function(data, status, headers, config) {
                                  $scope.fileList = data;

                           }).error(function(data, status, headers, config) {


              		});
              };

              $scope.frmSubmit = function(event) {

                     var myEl = angular.element( document.querySelector('#clientForm') );
                  myEl.attr('action',"/approve");
                  document.querySelector('#clientForm').submit();
                  return false;

              };

              $scope.lines = [ 1 ];

       }
</script>
</head>
<body>
<form method="post" name="clientForm" id="clientForm">
       <div ng-controller="MyCtrl" style="width: 350px;">




                     <table border="1">

                           <tr>
                                  <td colspan="">Select client: <select class="form-control"
                                         ng-model="selectedClientId"  ng-change="changeClient()">
                                         <option value="" >Select Client</option>
                                                <option ng-repeat="(key, val) in clientList"
                                                       value="{{ val.client_ID }}">{{ val.client_NAME }}</option>

                                  </select></td>
                           </tr>
                           <tr>
                                  <td>
                                                Sequence<select class="form-control" ng-model="line.text" >
                                                       <option ng-repeat="(key, val) in fileList"
                                                              value="{{ val.file_ID }}">{{ val.file_NAME }}</option>
                                                </select>



                                  </td>



                           </tr>
                           <tr>
                                  <td colspan=""><button ng-click="frmSubmit(event)"
                                                ng-model="submitbtn">Submit</button></td>
                           </tr>
                     </table>

       </div>
       </form>
</body>
</html>
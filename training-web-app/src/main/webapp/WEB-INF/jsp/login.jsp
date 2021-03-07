<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html ng-app>
<head>

<style type="text/css">
.userid.ng-valid {
	background-color: lightgreen;
}

.userid.ng-dirty.ng-invalid-required {
	background-color: red;
}

.userid.ng-dirty.ng-valid-minlength {
	background-color: yellow;
}

</style>

<link rel="stylesheet" href="../../../static/css/bootstrap.css">
<script type="text/javascript" src="../../../static/angular.min.js"></script>
<script type="text/javascript" src="../../../static/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body ng-app="myApp" class="ng-cloak">

<div class="generic-container" ng-controller="LoginController as loginCtrl">
		<div class="panel panel-default">
		<div class="panel-heading"> <span class="lead" >Login page</span></div>
			<div class="formcontainer">
			<form ng-submit="loginCtrl.submit()" name="myForm" class="form-horizontal">
			<input type="hidden" ng-model="loginCtrl.login.id" />
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-2 control-lable" for="file">Userid:</label>
					<div class="col-md-7">
					<input type="text" ng-modle="loginCtrl.login.userid" name="login" class="userid form-control input-sm"
						placeholder="Enter userid" required ng-minlength="3"/>
						<div class="has-error" ng-show="myForm.$dirty">
							<span ng-show="myForm.login.$error.required">This is a required field</span>
                            <span ng-show="myForm.login.$error.minlength">Minimum length required is 3</span>
                            <span ng-show="myForm.login.$invalid">This field is invalid </span>
                 		</div>
					</div>			
				</div>
			</div>


<div class="alert alert-info">
	<h1>Login page</h1>
	</div>
	<div class="alert alert-success">
	
		<label>Userid:</label><input type="text" ng-model="userid" size="25"> "{{ userid }}"<br>
		
		<label>Password:</label><input type="password" ng-model="password"> "{{password}}"<br>
		<input type="submit" name="Submit">
		<br>
		</div>
	
	
</body>
</html>
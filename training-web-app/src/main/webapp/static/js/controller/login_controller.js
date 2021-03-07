'use strict';

angular.module('myApp').controller('LoginController', ['$scope', 'LoginService', function ($scope, LoginService) {
	var self = this;
	self.login = { id: null, userid: '', password: '' };
	self.loginusers = [];

	self.submit = submit;
	//self.edit = edit;
	//self.remove = remove;
	//self.reset = reset;


	performAuthentication();

	function performAuthentication() {
		LoginService.performAuthentication()
			.then(
				function (d) {
					self.loginusers = d;
				},
				function (errResponse) {
					console.error('Error while performing authentication');
				}
			);
	}
}]);

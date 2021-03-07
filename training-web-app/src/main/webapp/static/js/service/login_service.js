'use strict'

angular.module('myApp').factory('LoginService', ['$http', '$q', function($http, $q){

	var REST_SERVICE_URI = 'http://localhost:8080/traing-web-app/login/';

	var factory = {
		performAuthentication: performAuthentication
	};

	return factory;

	function performAuthentication(){
		var deferred = $q.defer();
		$http.get(REST_SERVICE_URI)
		.then(
			function (response) {
				deferred.resolve(response.data);
				},
				function(errResponse){
					console.error('Error while performing authentication');
					deferred.reject(errResponse);
				}	
		);

		return deferred.promise;
	}

}]);
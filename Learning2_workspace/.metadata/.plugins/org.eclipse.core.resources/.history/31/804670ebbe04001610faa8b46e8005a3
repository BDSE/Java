var hibernateApp = angular.module('hibernateApp', ['ngRoute']);

hibernateApp.config(function ($routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl: 'templates/signInForm.html',
			controller: 'mainController'
		})
		.when('/succes', {
			templateUrl: 'templates/successPage.html',
			controller: 'successController'
		})
})

hibernateApp.controller('mainController', ['$scope', '$http', function ($scope, $http) {
	$scope.signIn = function () {
		$http({
			method: 'GET',
			url: 'login.jsp',
			params: {
				user: $scope.user,
				password: $scope.password
			},
			cache: true,
		}).then(function (response) {

		}, function (error) {
			//error function
		});
	}
}])

hibernateApp.controller('successController', ['$scope', function ($scope) {

}])
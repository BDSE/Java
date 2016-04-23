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

hibernateApp.service('$myService', function () {
	this.name = "Amar";
})

hibernateApp.controller('mainController', ['$scope', '$http', '$location', '$myService', function ($scope, $http, $location, $myService) {
	$scope.showError = false;
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
			console.log(response.data);
			var response = response.data.trim();
			var responseArr = response.split("|");
			console.log(responseArr[1]);

			if (responseArr[0] === "success") {
				$location.path('/succes')
				$myService.name = responseArr[1].trim();
			} else {
				$scope.showError = true;
			}

		}, function (error) {
			//error function
		});
	}
}])

hibernateApp.controller('successController', ['$scope', '$myService', function ($scope, $myService) {
	$scope.name = $myService.name;
}])
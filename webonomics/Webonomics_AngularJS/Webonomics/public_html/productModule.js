/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var module = angular.module("webonomics", []);

module.controller("productsController", function ($scope, $http, $rootScope) {
	
	$rootScope.Products = []; //Array for storing the data fetched from JSON file
	$scope.count = 8;
	
	//init function which will be called as the div loads
	$scope.init = function() {
		var jsondata = $http.get("http://localhost/crestrou/Webonomics_Angular/getItems.php",
					{params: {"currentCategory" : $rootScope.currentCategory}});
		jsondata.success(function (data) {
			$rootScope.Products = data;
			console.log("Result: ");
			console.log(JSON.stringify(data));
		});
		jsondata.error(function (error) {
			console.log("Error: " + error);
		});
	};
	
	$scope.ShowMore = function () {
		if ($scope.count > $scope.Products.length) {
			alert("No more records Found");
		}
		$scope.count = $scope.count + 8;
	}
});



/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
}


var module = angular.module("webonomics", ['ngRoute']);


module.controller("WebonomicsController", function ($scope, $http, $rootScope, $window) {
	$rootScope.ViewName = 'login';
	
	$scope.form = {
		loginusername : "",
		loginpassword : "",
		registerusername : "",
		registerpassword : ""
	};
	
//	$scope.loginusername = "";
//	$scope.registerusername = "";
//	$scope.loginpassword = "";
//	$scope.registerpassword = "";
	$scope.ShowPwd = false;
	$rootScope.isLogged = false;
	
//	Function to validate the user input and login successfully
	$scope.logInUser = function() {
		
		$scope.notFound = "00000";
		
		console.log("Username: " + $scope.form.loginusername);
		var jsondata = $http.get("http://localhost/crestrou/Webonomics_Angular/login.php", 
					{params: {"uname" : $scope.form.loginusername, 
						"password" : $scope.form.loginpassword}});
		jsondata.success(function (data) {
			if(data == $scope.notFound ) {
				console.log("User not registered.");
			} else {
				alert("Login Success");
				$rootScope.isLogged = true;
				$rootScope.loggedInUser = $scope.form.loginusername;
				alert("loogged in user " + $rootScope.loggedInUser);
				$rootScope.ViewName = 'main';
				$window.location.href = 'main.html';
			}

		});
		jsondata.error(function (error) {
			console.log("Error Caused: " + error);
		});
	};
	
	//	Function to validate the user input and Signup
	$scope.signUpUser = function() {
		
		$scope.alreadyExist = "23000";
		
		console.log("Username: " + $scope.form.registerusername);
		var jsondata = $http.get("http://localhost/crestrou/Webonomics_Angular/signup.php", 
					{params: {"uname" : $scope.form.registerusername, 
						"password" : $scope.form.registerpassword}});
		jsondata.success(function (data) {
			console.log("Data: " + data);
			if(data == $scope.alreadyExist ) {
				alert("Username already exists");
			} else {
				alert("Registered Successfully");
				$rootScope.isLogged = true;
				$rootScope.loggedInUser = $scope.form.registerusername;
				if ($rootScope.isLogged == true) {
					$window.location.href = 'main.html';
				}
			}
		});
		jsondata.error(function (error) {
			console.log("Error Caused: " + error);
		});
	};
});

module.controller("mainpageController", function ($scope, $rootScope, $http, $window) {
	$rootScope.loggedInUser = "Guest User";
	$scope.categories = [];
	$rootScope.currentCategory = "";
	$scope.MyData = [];
	
	//init function which will be called as the div loads
	$scope.init = function() {
		var jsondata = $http.get("http://localhost/crestrou/Webonomics_Angular/getCategory.php");
		jsondata.success(function (data) {
			$scope.categories = data;
//			console.log(JSON.stringify(data));
		});
		jsondata.error(function (error) {
			console.log("Error: " + error);
		});
	};
	
	$scope.displayItems = function(categoryName) {
		alert("Clicked");
		$rootScope.currentCategory = categoryName;
		alert("current: " + $rootScope.currentCategory);
		
		var jsondata = $http.get("http://localhost/crestrou/Webonomics_Angular/getItems.php",
					{params: {"currentCategory" : $rootScope.currentCategory}});
		alert("after jsondata");
		jsondata.success(function (data) {
			alert("insisde success");
			$scope.MyData = data;
			console.log("Result: ");
			console.log(JSON.stringify(data));
			console.log("Mydata: ");
			console.log($scope.MyData);
		});
		jsondata.error(function (error) {
			alert("inside error");
			console.log("Error: " + error);
		});
//		$window.location.href = "product.html";
	};
});



module.config(function($routeProvider) {
	//configure routes here
	$routeProvider.when('/faq', {
		templateUrl : 'http://localhost/crestrou/Webonomics_Angular/faq.html'
	}).when('/feedback', {
		templateUrl : 'http://localhost/crestrou/Webonomics_Angular/feedback.html'
	}).when('/', {
		templateUrl : 'login.html'
	}).when('/register', {
		templateUrl : 'register.html'
	}).when('/aboutus', {
		templateUrl : 'aboutus.html'
	}).when('/login', {
		templateUrl : 'login.html'
	});
});
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var mymodule = angular.module("webonomics", []);

mymodule.controller("LoginController", function ($scope, $rootScope) {
	
	$scope.ShowDetails = function() {
		console.log("Login Pressed --> Inside Show Details")
	}
});
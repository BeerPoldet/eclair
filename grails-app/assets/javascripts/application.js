//= require angular
//= require angular-ui-router
//= require user-story/user-story-module
//= require_self

/**
* eclair Module
*
* Description
*/
var app = angular.module('eclair', ['ui.router', 'eclair.userStory'])

.controller('TestCtrl', ['$scope', function($scope){
	$scope.test = "Hello";
}])

.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.otherwise("/user-story");
}]);
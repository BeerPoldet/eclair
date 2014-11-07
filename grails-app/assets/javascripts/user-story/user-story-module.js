//= require_self
//= require_tree /templates/eclair/user-story/

var module = angular.module('eclair.userStory', ['ui.router'])

.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

	$stateProvider
	.state('user-story', {
		url: "/user-story",
		templateUrl: "detail.html"
	})
	// .state('user-story.list', {
	// 	url: "/list",
	// 	templateUrl: "list.html",
	// 	controller: function($scope) {
	// 		$scope.items = ["A", "List", "Of", "Items"];
	// 	}
	// })
}]);
angular.module('simple', ['ngAnimate', 'ngRoute', 'ngResource','bookService'])
	.config(function($routeProvider, $locationProvider) {

		$locationProvider.html5Mode(true);

		$routeProvider.when('/book', {
			templateUrl: 'partials/book.html',
			controller: 'BookControllerForm'
		});
		$routeProvider.when('/books', {
        			templateUrl: 'partials/books.html',
        			controller: 'BooksController'
        		});


		$routeProvider.when('/home', {
			templateUrl: 'Index.html'
		});

		$routeProvider.otherwise({redirectTo: '/home'});

	});
angular.module('simple').controller('BooksController', function($scope,bookResource,$routeParams) {


    	$scope.books = [];
    	$scope.filter = '';
    	$scope.message = '';

    	bookResource.query(function(books) {
    		$scope.books = books;
    	}, function(error) {
    		console.log(error);
    	});

    	$scope.remover = function(book) {

    		bookResource.delete({id: book.id}, function() {
    			var indexBook = $scope.books.indexOf(book);
    			$scope.books.splice(indexBook, 1);
    			$scope.message = 'Book ' + book.name + ' was successful remove !';
    		}, function(error) {
    			console.log(error);
    			$scope.message = 'It was not possible to remove the Book ' + book.name;
    		});
    	};




}
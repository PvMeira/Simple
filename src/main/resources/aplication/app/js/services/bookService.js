angular.module('bookService', ['ngResource'])
	.factory('bookResource', function($resource) {

		return $resource('/books/:id', null, {
			'update' : {
				method: 'PUT'
			}
		});
	})
	.factory("bookRegister", function(bookResource, $q) {
		var service = {};

		service.register = function(book) {
			return $q(function(resolve, reject) {

				if(book.id) {
					bookResource.update({id: book.id}, book, function() {
						resolve({
							message: 'Book ' + book.name + ' was successful update',
							registerStatus: false
						});
					}, function(error) {
						console.log(error);
						reject({
							message: 'It was not possible update the Following book' + book.name
						});
					});

				} else {
					bookResource.save(book, function() {

						resolve({
							message: 'Book ' + book.name + ' was successful insert',
							registerStatus: true
						});
					}, function(error) {
						console.log(error);
						reject({
							message: 'It was not possible insert the Following book' + book.name
						});
					});
				}
			});
		};
		return service;
    });
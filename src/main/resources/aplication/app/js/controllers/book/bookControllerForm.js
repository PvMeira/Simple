angular.module('simple').controller('BookControllerForm', function($scope,bookResource,$routeParams,bookRegister) {
        $scope.book = {};
		$scope.message = '';

		if($routeParams.id) {
        			bookResource.get({id: $routeParams.id}, function(book) {
        				$scope.book = book;
        			}, function(error) {
        				console.log(error);
        				$scope.message = 'It was not possible to obtain the Book'
        			});
        		}
        $scope.submit = function() {

        			if ($scope.bookForm.$valid) {
        				bookRegister.register($scope.book)
        				.then(function(data) {
        					$scope.message = data.message;
        					if (data.registerStatus) $scope.book = {};
        				})
        				.catch(function(error) {
        					$scope.message = error.message;
        				});
        			}
        		};

});
define(['jquery', 'handlebars',	'backbone', 'app/views/searchView'],
		function($, Handlebars, Backbone, SearchView) {
	
	// JS Module Below

	var AppRouter = Backbone.Router.extend({
		routes: {
			"": "search",
			"menu-items/new": "itemForm",
			"menu-items/:item": "itemDetails"
		},
		
		list: function(){
			$('#app').html('List screen');
		},
		
		itemDetails: function(item) {
			$('#app').html('Menu item: ' + item);
		},
		
		itemForm: function() {
			$('#app').html('New item form');
		},

		search:function(){
			var searchView = new SearchView({ el: $("#search_container") });
			searchView.render();
		}
	});
	
	var app = new AppRouter();
	
	// export stuff:
    return {
        'AppRouter': app
    };

});
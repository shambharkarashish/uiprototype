requirejs.config({
  'baseUrl': '/foodcourt',
  'paths': {
    'app': 'resources/js/app',
    'jquery': 'resources/js/lib/jquery-latest',
    'underscore': 'resources/js/lib/underscore-min',
    'backbone': 'resources/js/lib/backbone-min',
    'handlebars': 'resources/js/lib/handlebars-v1.3.0',
    'text':'resources/js/lib/text-2.0.6'
  },
  'shim': {
	    'underscore': {
	      'exports': '_'
	    },
	    'backbone': {
	      'deps': ['jquery', 'underscore'],
	      'exports': 'Backbone'
	    },
	    'handlebars': {
	      'exports': 'Handlebars'
	    }
	  }
});

require(['backbone', 'app'], function(Backbone, Application) {
	
	$(function(){
		Backbone.history.start();	
	});
});
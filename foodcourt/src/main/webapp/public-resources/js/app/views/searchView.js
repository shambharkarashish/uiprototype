define(['jquery', 'handlebars',	'backbone', 'text!app/templates/searchBox.htm'],
    function($, Handlebars, Backbone, SearchBox) {

        var SearchView = Backbone.View.extend({

            initialize: function(){
                alert("Inside Search Box.");
            },
            render: function(){
                // Compile the template using underscore
                var template = _.template(SearchBox, {} );
                // Load the compiled HTML into the Backbone "el"
                this.$el.html(template);
                return this;
            }
        });

        return SearchView;
    }
);
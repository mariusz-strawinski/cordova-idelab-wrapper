var exec = require('cordova/exec');

var PLUGIN_NAME = 'CordovaIDELabWrapper';

var CordovaIDELabWrapper = {
	send: function(phrase, cb) {
		exec(cb, null, PLUGIN_NAME, 'idelab', [phrase]);
		alert('TEST');
		},
 	getDate: function(cb) {
    		exec(cb, null, PLUGIN_NAME, 'getDate', []);
		}
	
	}


module.exports = CordovaIDELabWrapper;

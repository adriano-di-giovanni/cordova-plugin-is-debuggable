var exec = require('cordova/exec');
module.exports = function(successCallback, errorCallback) {
    var onSuccess = function(result) {
        successCallback(!!result);
    };

    var onError = function(errorMessage) {
        errorCallback(new Error(errorMessage));
    };

    exec(onSuccess, onError, 'isDebuggable', 'get', []);
};

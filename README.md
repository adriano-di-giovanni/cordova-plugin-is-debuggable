# cordova-plugin-is-debuggable

[![Build Status](https://travis-ci.org/adriano-di-giovanni/cordova-plugin-is-debuggable.svg?branch=master)](https://travis-ci.org/adriano-di-giovanni/cordova-plugin-is-debuggable)

Is application debuggable?

## Installation

```bash
cordova plugin add cordova-plugin-is-debuggable
```

## Supported platforms

* Android
* iOS

## Example

```javascript
document.addListener('deviceready', onDeviceReady, false);
function onDeviceReady() {
    window.plugins.isDebuggable(successCallback, errorCallback);
}
```

## License

This project is [MIT-licensed](https://raw.githubusercontent.com/adriano-di-giovanni/cordova-plugin-is-debuggable/master/LICENSE).

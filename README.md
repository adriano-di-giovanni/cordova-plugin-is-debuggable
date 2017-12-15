# cordova-plugin-is-debuggable

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

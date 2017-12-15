#import "CDVIsDebuggable.h"

@implementation CDVIsDebuggable

- (void)get:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;

#ifdef DEBUG
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsBool:true];
#else
    pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsBool:false];
#endif

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}
@end

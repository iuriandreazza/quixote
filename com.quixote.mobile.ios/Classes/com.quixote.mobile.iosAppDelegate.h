//
//  com.quixote.mobile.iosAppDelegate.h
//  com.quixote.mobile.ios
//
//  Created by _developer_ on 12.12.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

@class com.quixote.mobile.iosViewController;

@interface com.quixote.mobile.iosAppDelegate : NSObject <UIApplicationDelegate> {
    UIWindow *window;
    com.quixote.mobile.iosViewController *viewController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;
@property (nonatomic, retain) IBOutlet com.quixote.mobile.iosViewController *viewController;

@end


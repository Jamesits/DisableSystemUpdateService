Disable SystemUpdateService
=====================

![OK Google, Sleep!](https://github.com/Jamesits/DisableSystemUpdateService/raw/master/misc/okgooglesleepheader.png)

----------

This a simple app to fix SystemUpdateService wakelock which keeps your favorite Android device awake and drains much battery.

__*ROOT REQUIRED*__

![No more SystemUpdateService wakelock](https://github.com/Jamesits/DisableSystemUpdateService/raw/master/misc/displayphoto.png)

Tested on the following condition:

 * Hardware: OnePlus One A0001
 * OS: OxygenOS 1.0.0 (A1001_12_150527), Android 5.0.2
 * Software: Google Play Service version 7.5.74 (1997312-438), Google Services Framework version 5.0.1-1602158

## Usage

Get it from [Google Play](https://play.google.com/store/apps/details?id=me.swineson.disablesystemupdateservice), or view the latest [release](https://github.com/Jamesits/DisableSystemUpdateService/releases).

Install the app on your device. Launch it once. Grant it root permission. Forget it. 

It needs to autostart every time your device boots. Don't kill it manually, please.

If you don't want it anymore, uninstall it from Settings, and reboot.

## License

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see [http://www.gnu.org/licenses/](http://www.gnu.org/licenses/).

## Thanks

 * @ucwong: gives me the idea to fix it.
 * [@GhostFlying](https://github.com/GhostFlying): This app is based on his [LocationReportEnabler](https://github.com/GhostFlying/LocationReportEnabler).
 
## References

Without those articles I would never find out the solution.
 
  * [[FIX] OxygenOS Wakelock](https://forums.oneplus.net/threads/fix-oxygenos-wakelock.291648/)
  * [Battery Drain/wakelock Systemupdateservice](https://forums.oneplus.net/threads/battery-drain-wakelock-systemupdateservice.50933/#post-2322634)
  * [Systemupdateservice Wakelock On Cm11 M7 (Massive Battery Drain)](http://forum.cyanogenmod.org/topic/96459-systemupdateservice-wakelock-on-cm11-m7-massive-battery-drain/)
  * [[Standard/Minimal GApps][Closed]](http://forum.xda-developers.com/showpost.php?p=53739230&postcount=5031)
  * [Permanent fix for SystemUpdateService wakelock [OxygenOS]](https://forums.oneplus.net/threads/permanent-fix-for-systemupdateservice-wakelock-oxygenos.293254/)
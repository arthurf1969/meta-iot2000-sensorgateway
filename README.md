# meta-iot2000-sensorgateway

This README file contains information on building the meta-iot2000-sensorgateway layer
for the Simatic IoT2000 device.


Dependencies
============

This layer depends on:

```
  URI: git://git.yoctoproject.org/poky
  layers: meta, meta-yocto, meta-yocto-bsp
  branch: morty

  URI: git://git.openembedded.org/meta-openembedded
  layers: meta-oe
  branch: morty

  URI: git://git.yoctoproject.org/meta-intel
  layers: meta-intel
  branch: morty

  URI: git://git.yoctoproject.org/meta-intel-iot-middleware
  layers: meta-intel-iot-middleware
  branch: master

  URI: git://github.com/siemens/meta-iot2000
  layers: meta-iot2000-bsp
  branch: jan/morty
```

Building the meta-iot2000-sensorgateway BSP Layer
==================================================

This uses Yocto 2.2 (Morty) with the 4.8 Linux kernel provided by Yocto and
the meta-intel layer. The build has be tested successfully on Debian 8 and
OpenSuse 13.2, but other recent distros are expected to work as well.

## Prepare:

For setting up your host pc see the following description:
[3. Setting Up to Use the Yocto Project](http://www.yoctoproject.org/docs/2.1/mega-manual/mega-manual.html#yp-resources)

```shell
$ git clone git://git.yoctoproject.org/poky.git poky -b morty
$ git clone git://git.yoctoproject.org/meta-intel poky/meta-intel -b morty
```

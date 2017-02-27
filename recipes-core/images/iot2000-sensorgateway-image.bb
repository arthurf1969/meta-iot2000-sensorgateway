SUMMARY = "Image for the IOT2000 platform used as a sensorgateway"
DESCRIPTION = "Image for the IOT2000 platform used as a sensorgateway"
LICENSE = "MIT"

PR = "r3"

IMAGE_INSTALL_append = " openssh"
IMAGE_INSTALL_append = " nodejs nodejs-npm"
IMAGE_INSTALL_append = " curl"
IMAGE_INSTALL_append = " nano tree"


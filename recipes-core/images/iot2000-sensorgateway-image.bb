DESCRIPTION = "Image for the IOT2000 platform used as a sensorgateway"

PR = "r2"

#require iot2000-sensorgateway-image.inc
#require recipes-core/images/core-image-minimal.bb
#require recipes-core/images/wic-image.inc


#PREFERRED_VERSION_mosquitto ?= "1.4.11"

IMAGE_INSTALL_append = " openssh"
IMAGE_INSTALL_append = " nodejs nodejs-npm"
IMAGE_INSTALL_append = " curl"
IMAGE_INSTALL_append = " nano tree"

require recipes-core/images/rpi-test-image.bb
IMAGE_INSTALL += "blink strace curl nlohmann-json"
IMAGE_INSTALL += "curl nlohmann-json"
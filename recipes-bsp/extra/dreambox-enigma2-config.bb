DESCRIPTION = "Dreambox box-specific configuration files"
SECTION = "base"
PRIORITY = "required"
MAINTAINER = "PLi team"
LICENSE = "WTFPL"
COMPATIBLE_MACHINE = "^(dm7020hd|dm8000)$"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b71aebc25e7533ebaa5b320a20e7ed2"

SRC_URI = "file://skin_box.xml file://LICENSE"

PACKAGES = "${PN}"

FILES_${PN} = "${datadir}/enigma2"

PACKAGE_ARCH = "${MACHINE}"

S = "${WORKDIR}"

do_install() {
	install -d ${D}${datadir}/enigma2
	install -m 644 ${S}/skin_box.xml ${D}${datadir}/enigma2/
}

require xorg-lib-common.inc

SUMMARY = "XI: X Input extension library"

DESCRIPTION = "libxi is an extension to the X11 protocol to support \
input devices other than the core X keyboard and pointer.  It allows \
client programs to select input from these devices independently from \
each other and independently from the core devices."

LICENSE = "MIT & MIT-style"
LIC_FILES_CHKSUM = "file://COPYING;md5=17b064789fab936a1c58c4e13d965b0f \
                    file://src/XIGetDevFocus.c;endline=23;md5=cdfb0d435a33ec57ea0d1e8e395b729f"

DEPENDS += "libxext inputproto libxfixes"

PE = "1"

XORG_PN = "libXi"

SRC_URI[md5sum] = "94afc83e553d3c38a153f8f60301fd62"
SRC_URI[sha256sum] = "d8f2fa8d53141c41ff521627df9b2fa9c05f6f142fd9881152bab36549ac27bb"


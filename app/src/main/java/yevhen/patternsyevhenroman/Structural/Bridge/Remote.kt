package yevhen.patternsyevhenroman.Structural.Bridge

import android.bluetooth.BluetoothClass

class Remote(protected val device: Device) {

    fun togglePower() {
        if (device.isEnabled()) device.disable() else  device.enable()
    }

    fun volumeDown() {

    }

    fun volumeUp() {

    }

    fun channelUp() {

    }

    fun channelDown() {

    }

}
package com.example.hearthapp.numsfordumbs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.example.hearthapp.R

class SettingsDialogFragment
(
    /** The size.  */
    var size: Int
) : DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        // Set the dialog title
        builder.setTitle("Define the size of the puzzle")
            .setSingleChoiceItems(
                R.array.size_options, size - 2
            ) { dialog, which -> size = which + 2 }
            .setPositiveButton(
                "Change"
            ) { dialog, id ->
                (activity as NumsFDMain)
                    .changeSize(size)
            }
            .setNegativeButton(
                "Cancel"
            ) { dialog, id -> dialog.cancel() }
        val settingsDialog =  builder.create()
        settingsDialog.show()
        return  settingsDialog
    }
}
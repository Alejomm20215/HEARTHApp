package com.example.hearthapp.numsfordumbs

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.hearthapp.R

class NumsFDMain : AppCompatActivity() {
    private  var mainView: ViewGroup?=null
    private  var board:Board?=null
    private  var boardView:BoardView?=null
    private lateinit var moves: TextView
    private var boardSize = 4


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nums_fdmain)
        /**set findId*/
        mainView = findViewById(R.id.mainView)
        moves = findViewById(R.id.moves)
        moves.setTextColor(Color.RED)
        moves.textSize = 22f
        newGame()

        findViewById<Button>(R.id.backButtonNFD).setOnClickListener {
            intent = Intent(this, NFDScreenActivity::class.java)
            startActivity(intent)
        }

        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.navigationBarColor = this.resources.getColor(R.color.yellow_jo)
        window.statusBarColor = this.resources.getColor(R.color.background)
    }

    private fun newGame() {
        board = Board(boardSize)
        board!!.addBoardChangeListener(boardChangeListener)
        board!!.rearrange()
        mainView!!.removeView(boardView)
        boardView = BoardView(this,board!!)
        mainView!!.addView(boardView)
        moves.text = "Number of movements : 0"
    }

    fun changeSize(newSize: Int) {
        if (newSize != boardSize) {
            boardSize = newSize
            newGame()
            boardView!!.invalidate()
        }
    }

    private val boardChangeListener :BoardChangeListener = object :BoardChangeListener{
        override fun tileSlid(from: Place?, to: Place?, numOfMoves: Int) {
            moves.text = "Number of movements : ${numOfMoves}"
        }

        override fun solved(numOfMoves: Int) {

            moves.text = "Solved in ${numOfMoves} moves"

            AlertDialog.Builder(this@NumsFDMain)
                .setTitle("You won .. !!")
                .setIcon(R.drawable.ic_celebration)
                .setMessage("YOU WON IN $numOfMoves MOVES !! \nDO YOU WANT A NEW GAME?")
                .setPositiveButton("Yes"){
                        dialog,_->
                    board!!.rearrange()
                    moves.text = "Number of movements : 0"
                    boardView!!.invalidate()
                    dialog.dismiss()
                }
                .setNegativeButton("No"){
                        dialog, _->
                    dialog.dismiss()
                }
                .create()
                .show()

        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {

                val settings = SettingsDialogFragment(boardSize)
                settings.show(supportFragmentManager, "fragment_settings")
            }
            R.id.action_new_game ->
            {
                android.app.AlertDialog.Builder(this)
                    .setTitle("New Game")
                    .setMessage("REALLY REALLY SURE??")
                    .setPositiveButton(
                        android.R.string.yes
                    ) { dialog, which ->
                        board!!.rearrange()
                        moves.text = "Number of movements: 0"
                        boardView!!.invalidate()
                    }
                    .setNegativeButton(
                        android.R.string.no
                    ) { dialog, which ->
                        // do nothing
                    }.setIcon(R.drawable.ic_new_game)
                    .show()
            }
            R.id.action_help -> {
                android.app.AlertDialog.Builder(this)
                    .setTitle("Instructions")
                    .setMessage(
                        "The goal of the puzzle is to place the tiles in order by making sliding moves that use the empty space. The only valid moves are to move a tile which is immediately adjacent to the blank into the location of the blank."
                    )
                    .setPositiveButton(
                        "Got You... Let's play!"
                    ) { dialog, which -> dialog.dismiss() }.show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
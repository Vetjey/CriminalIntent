package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText

class CrimeFragment : Fragment() {
    var Crime:Crime = Crime()
    lateinit var DateButton:Button
    lateinit var TitleField:EditText
    lateinit var SolvedCheckBox:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var View = inflater.inflate(R.layout.fragment_crime, container, false)

        TitleField = View.findViewById(R.id.crime_title)
        TitleField.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Crime.Title = s.toString()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        DateButton = View.findViewById(R.id.crime_date)
        DateButton.text = Crime.Date.toString()
        DateButton.isEnabled = false

        SolvedCheckBox = View.findViewById(R.id.crime_solved)
        SolvedCheckBox.setOnCheckedChangeListener(object :CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Crime.Solved = isChecked
            }
        })

        return View
    }


}
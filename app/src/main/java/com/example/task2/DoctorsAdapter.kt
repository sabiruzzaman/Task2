package com.example.task2

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.task2.data.model.Doctor
import com.example.task2.databinding.ItemDoctorsBinding

class DoctorsAdapter(private val context: Context) :

    RecyclerView.Adapter<DoctorsAdapter.DoctorsViewHolder>() {

    class DoctorsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemDoctorsBinding.bind(itemView)
    }

    private var doctorsList: ArrayList<Doctor> = ArrayList()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(doctors: ArrayList<Doctor>) {
        doctorsList.clear()
        doctorsList.addAll(doctors)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorsViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_doctors, parent, false)
        return DoctorsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorsViewHolder, position: Int) {

        val doctors = doctorsList[position]

        with(holder.binding) {
            doctorNameTvId.text = "Name: " + doctors.user?.fullName
            designationTvId.text = "Designation: " + doctors.user?.designation
            specialtyTvId.text = "Specialist: " + doctors.specialist
            departmentTvId.text = "Department: " + doctors.department?.title
            qualificationTvId.text = "Qualification: " + doctors.user?.qualification
            feeValueTvId.text = "Fee: " + doctors.fee
            phoneNoTvID.text = "Phone: " + doctors.user?.phone
            emailTvId.text = "Email: " + doctors.user?.email

        }
    }

    override fun getItemCount(): Int {
        return doctorsList.size
    }
}

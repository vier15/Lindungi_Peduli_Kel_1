package com.kel1.lindungilansia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JadwalObatFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JadwalObatFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JadwalObatFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JadwalObatFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JadwalObatFragment newInstance(String param1, String param2) {
        JadwalObatFragment fragment = new JadwalObatFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jadwal_obat, container, false);

        // Navigasi ke navbar
        FloatingActionButton btnJadwalObatNavBar = view.findViewById(R.id.btnJadwalObatNavBar);
        btnJadwalObatNavBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_jadwalObatFragment_to_navBarFragment);
            }
        });

        // Navigasi ke halaman tambah jadwal obat
        FloatingActionButton btnJadwalObatTambahJadwalObat = view.findViewById(R.id.btnJadwalObatTambahJadwalObat);
        btnJadwalObatTambahJadwalObat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_jadwalObatFragment_to_tambahObatFragment);
            }
        });

        return view;
    }
}
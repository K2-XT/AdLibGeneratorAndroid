package com.example.adlibandroidjava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.adlibandroidjava.databinding.GeneratorFieldsFragmentBinding;

public class FirstFragment extends Fragment {

    private GeneratorFieldsFragmentBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = GeneratorFieldsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noun1 = binding.NounOneField.getText().toString();
                String noun2 = binding.NounTwoField.getText().toString();
                String verb1 = binding.VerbOneField.getText().toString();
                String verb2 = binding.VerbTwoField.getText().toString();
                String adjective = binding.AdjectiveField.getText().toString();
                String adverb = binding.AdverbField.getText().toString();
                handleGenerateAdLib(noun1, noun2, verb1, verb2, adjective, adverb);
            }
        });
    }

    public void handleGenerateAdLib(String noun1, String noun2, String verb1, String verb2, String adjective, String adverb) {
        Bundle bundle = new Bundle();
        bundle.putString("noun1", noun1);
        bundle.putString("noun2", noun2);
        bundle.putString("verb1", verb1);
        bundle.putString("verb2", verb2);
        bundle.putString("adjective", adjective);
        bundle.putString("adverb", adverb);
        NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}

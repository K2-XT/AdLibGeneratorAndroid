package com.example.adlibandroidjava;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.adlibandroidjava.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String noun1 = getArguments().getString("noun1");
        String noun2 = getArguments().getString("noun2");
        String verb1 = getArguments().getString("verb1");
        String verb2 = getArguments().getString("verb2");
        String adjective = getArguments().getString("adjective");
        String adverb = getArguments().getString("adverb");

        String adLibPart1 = "One day, Tom the cat was sleeping when a mouse named Jerry saw him and decided to spoil his fun. With a mischevious grin and a wink toward an audience who appeared to be missing, Jerry quickly ran into his mouse-hole and grabbed his nicest ";
        String adLibPart2 = " before running back to Tom. Being careful not to wake Tom, Jerry ";
        String adLibPart3 = " up to the cat's tail and proceeded to smash down the ";
        String adLibPart4 = " with all of his strength! Tom yowled and jumped in the air! Jerry began to scurry as Tom seemingly floated in the air. Once Tom reached the ground, his hand swooped to the nearest object, a ";
        String adLibPart5 = ", and he grabbed it with his might! He ran after Jerry, catching up with him, and grabbed Jerry in one hand, ready to bash him in the head! However, as Tom brought the ";
        String adLibPart6 = " ";
        String adLibPart7 = " down, Jerry freed his arms, grabbed the ";
        String adLibPart8 = " and began to ";
        String adLibPart9 = " ";
        String adLibPart10 = " Tom with the ";
        String adLibPart11 = ". Surprised, Tom let go and Jerry tumbled to the floor. He quickly ran back into his hole, where Tom had no chance of catching him.";

        String constructedAdLib = adLibPart1 + noun1 + adLibPart2 + verb1 + adLibPart3 + noun1 + adLibPart4 + noun2 + adLibPart5 + adjective + adLibPart6 + noun2 + adLibPart7 + noun2 + adLibPart8 + adverb + adLibPart9 + verb2 + adLibPart10 + noun2 + adLibPart11;

        binding.AdLibTextView.setText(constructedAdLib);

//            binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    NavHostFragment.findNavController(SecondFragment.this)
//                            .navigate(R.id.action_SecondFragment_to_FirstFragment);
//                }
//            });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}

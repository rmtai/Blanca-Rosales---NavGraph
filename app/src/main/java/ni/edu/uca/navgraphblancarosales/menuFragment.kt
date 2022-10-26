package ni.edu.uca.navgraphblancarosales

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navgraphblancarosales.databinding.FragmentMenuBinding

private lateinit var binding: FragmentMenuBinding
class menuFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnModa.setOnClickListener{
            findNavController().navigate(R.id.btnModa)
        }
        binding.btnCubo.setOnClickListener{
            findNavController().navigate(R.id.btnCubo)
        }
        binding.btnNombre.setOnClickListener{
            findNavController().navigate(R.id.btnNombre)
        }
    }


}

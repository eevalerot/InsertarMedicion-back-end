package com.insertar.medicion.dispositivo.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insertar.medicion.dispositivo.entities.MedicionAutomatica;
import com.insertar.medicion.dispositivo.repository.medidorAutomaticoRepository;
import com.insertar.medicion.dispositivo.service.MedidorAutomaticoService;

@Service
public class MedidorImpl implements MedidorAutomaticoService{

	@Autowired
	private medidorAutomaticoRepository medidorAutomaticoRepository;
	
	@SuppressWarnings("unused")
	@Override
	public Boolean saveMedidas(String intensidad, String potencia) {
		
		MedicionAutomatica medicionAutomatica = new MedicionAutomatica();
		
		if(intensidad != null) {
			medicionAutomatica.setIntencidad(intensidad);
		}else {
			medicionAutomatica.setIntencidad("");
		}
		if(potencia != null) {
			medicionAutomatica.setPotencia(potencia);
		}else {
			medicionAutomatica.setPotencia("");
		}
		
		if(medicionAutomatica != null) {
			medidorAutomaticoRepository.save(medicionAutomatica);
		}else {
			return false;
		}
		
			
		
		return true;
	}

}

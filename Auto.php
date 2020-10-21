<?php
	class Auto{
		private $marca;
		private $modelo;
		private $color;
		private $velocidad;
		
		public function Auto($marca, $modelo, $color){
			$this->marca=$marca;
			$this->modelo=$modelo;
			$this->color=$color;
		}
		
		public function acelerar(){
			$this->velocidad+=10;
		}
	}

	echo 'Hola Mundo';
	
	$auto1=new Auto("VW","UP","Blanco");	
	$auto1->acelerar();
		
?>

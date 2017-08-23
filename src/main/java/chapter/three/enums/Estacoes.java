package chapter.three.enums;

public enum Estacoes {

	PRIMAVERA {
		@Override
		public void mostrarHoraEscurece() {
			// TODO Auto-generated method stub

		}
	},
	VERAO {
		@Override
		public void mostrarHoraEscurece() {
			// TODO Auto-generated method stub

		}
	},
	OUTONO {
		@Override
		public void mostrarHoraEscurece() {
			// TODO Auto-generated method stub

		}
	},
	INVERNO {
		@Override
		public void mostrarHoraEscurece() {
			// TODO Auto-generated method stub

		}
	};

	public abstract void mostrarHoraEscurece();

}

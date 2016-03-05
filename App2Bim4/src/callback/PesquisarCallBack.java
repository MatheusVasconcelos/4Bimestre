package callback;

import java.util.List;

import model.Pessoa;

public interface PesquisarCallBack {

	void backBuscarNome(List<Pessoa> list);

	void errorBuscarNome(String error);
}

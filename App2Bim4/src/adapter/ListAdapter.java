package adapter;

import java.util.List;

import com.example.app2bim4.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import model.Pessoa;

public class ListAdapter extends BaseAdapter {

	Context context;

	List<Pessoa> pessoas;

	public ListAdapter(Context context, List<Pessoa> pessoas) {
		this.context = context;
		this.pessoas = pessoas;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder = null;

		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

		if (convertView == null) {

			convertView = mInflater.inflate(R.layout.item_list, null);

			holder = new ViewHolder();
			holder.txtInscription = (TextView) convertView
					.findViewById(R.id.inscription);
			holder.txtFullName = (TextView) convertView
					.findViewById(R.id.fullName);
			holder.txtEmail = (TextView) convertView.findViewById(R.id.email);
			holder.txtEntregue = (TextView) convertView
					.findViewById(R.id.entregue);

			convertView.setTag(holder);

		} else {

			holder = (ViewHolder) convertView.getTag();
		}

		Pessoa pessoaItem = (Pessoa) getItem(position);

		holder.txtFullName.setText(pessoaItem.getNome());
		holder.txtInscription.setText(pessoaItem.getDescricao());
		holder.txtEmail.setText(pessoaItem.getEmail());

		if (pessoaItem.isEntregue() == false) {
			holder.txtEntregue.setText("N�o Entregue");
		} else
			holder.txtEntregue.setText("Entregue");

		return convertView;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	private class ViewHolder {

		TextView txtFullName;
		TextView txtInscription;
		TextView txtEmail;
		TextView txtEntregue;
	}

}

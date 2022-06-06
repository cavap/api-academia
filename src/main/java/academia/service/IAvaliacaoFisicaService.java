package academia.service;

import academia.entity.AvaliacaoFisica;
import academia.entity.form.AvaliacaoFisicaForm;
import academia.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
  AvaliacaoFisica create(AvaliacaoFisicaForm form);
  AvaliacaoFisica get(Long id);
  List<AvaliacaoFisica> getAll();
  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
  void delete(Long id);
}

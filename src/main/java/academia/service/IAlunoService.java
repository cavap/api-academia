package academia.service;

import academia.entity.Aluno;
import academia.entity.AvaliacaoFisica;
import academia.entity.form.AlunoForm;
import academia.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
  Aluno create(AlunoForm form);
  Aluno get(Long id);
  List<Aluno> getAll(String dataDeNascimento);
  Aluno update(Long id, AlunoUpdateForm formUpdate);
  void delete(Long id);
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}

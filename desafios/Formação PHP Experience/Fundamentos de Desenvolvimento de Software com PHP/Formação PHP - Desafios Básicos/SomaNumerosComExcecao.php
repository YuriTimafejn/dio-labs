<?php
  // Leia o Desafio e siga o código base abaixo para resolvê-lo. Algumas dicas:
  // 1. Use a função "fgets(STDIN)" para ler uma linha de Entrada;
  // 2. Use a função "echo" formatar e imprimir sua(s) Saída(s).

$numero = intval(fgets(STDIN));

$soma = 0;
$ultimo = 0;

for($i=1; $i <= $numero; $i++)
{
  if($i%3 != 0)
  {
    $soma += $i;
  }
}

echo "Soma dos números de 1 a {$numero}, exceto os divisíveis por 3: {$soma}";

?>
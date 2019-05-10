var calcular = () => {

    let numeros = document.getElementById('listNumbers').value;
    let listado = numeros.split(',')
    let listint = []
    let listRepet=[];
    listado.map((d) => {
        if (Number.isInteger(parseInt(d))) {
            listint.push(parseInt(d))
        }
    })
    listint.sort()
    if (listint != null) {

        for (i = 1; i < listint.length; i++) {
            if (listint[i] == listint[i - 1]) {
                if (i <= 1) {
                    listRepet.push(listint[i]);
                }
                if (i > 1 && (listint[i] != listint[i - 2])) {
                    listRepet.push(listint[i]);
                } else {

                }
            }
        }

    }
    document.getElementById('resultado').innerHTML = " se encontraron "+ listRepet.length + " numeros repetidos y estos son: ["+ listRepet+"]";
    console.log(listRepet)
}

// meuprojeto-frontend/script.js

const carroForm = document.getElementById('carroForm');
const modeloIdInput = document.getElementById('modeloId');
const anoInput = document.getElementById('ano');
const combustivelInput = document.getElementById('combustivel');
const numPortasInput = document.getElementById('numPortas');
const corInput = document.getElementById('cor');
const carrosList = document.getElementById('carrosList');

carroForm.addEventListener('submit', async (event) => {
    event.preventDefault();

    const modeloId = modeloIdInput.value;
    const ano = anoInput.value;
    const combustivel = combustivelInput.value;
    const numPortas = numPortasInput.value;
    const cor = corInput.value;

    try {
        const response = await fetch('http://localhost:8080/api/carros', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ modeloId, ano, combustivel, numPortas, cor })
        });

        if (!response.ok) {
            throw new Error('Erro ao criar carro');
        }

        const carro = await

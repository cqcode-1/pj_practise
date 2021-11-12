const threeStep = {

    state: {
        cellMessage: [],
        estateCode: ''
    },
    mutations: {
        SET_TITLE3(state, payload) {
            state.cellMessage = payload.cellMessage
            state.estateCode = payload.estateCode
            console.log('threeStep', state.cellMessage)
        }
    },
    actions: {

    },
    getters: {

    }

}

export default threeStep

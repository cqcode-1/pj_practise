const threeStep = {

    state: {
        units: []
    },
    mutations: {
        SET_TITLE3(state, payload) {
            state.units = payload.units
            console.log('threeStep', state.units)
        }
    },
    actions: {

    },
    getters: {

    }

}

export default threeStep

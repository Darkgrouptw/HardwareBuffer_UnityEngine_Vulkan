using UnityEngine.Rendering.RenderGraphModule;
using UnityEngine.Rendering;
using UnityEngine.Rendering.Universal;

public class CockpitOutline : FullscreenEffectBase<CockpitOutlinePass>
{
}

public class CockpitOutlinePass : FullscreenPassBase<FullscreenPassDataBase>
{
    bool IsOutlineEnabled()
    {
        var volumeComponent = VolumeManager.instance.stack.GetComponent<OutlineVolumeComponent>();

        return volumeComponent.Enabled.value;
    }

    public override void Execute(ScriptableRenderContext context, ref RenderingData renderingData)
    {
        if (IsOutlineEnabled())
            base.Execute(context, ref renderingData);
    }

    public override void RecordRenderGraph(RenderGraph renderGraph, ContextContainer frameData)
    {
        if (IsOutlineEnabled())
            base.RecordRenderGraph(renderGraph, frameData);
    }
}